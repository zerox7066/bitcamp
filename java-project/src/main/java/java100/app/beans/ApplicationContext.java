package java100.app.beans;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class ApplicationContext {
    
    HashMap<String,Object> pool = new HashMap<>();

    public ApplicationContext() {}
    
    public ApplicationContext(String propPath) {
        Properties props = new Properties();
        try (FileReader in = new FileReader(propPath)) {
            
            props.load(in);
            
            Set<Object> keySet = props.keySet();
            
            for (Object key : keySet) {
                //System.out.printf("%s ==> %s\n", key, props.get(key));

                String name = (String)key;
                Class<?> clazz = Class.forName(props.getProperty(name));
                
                Object obj = clazz.newInstance();
                
                pool.put(name, obj);
            }
            
            injectDependency();
            
            /*
            Collection<Object> list = beanContainer.values();
            for (Object obj : list) {
                System.out.println(obj.getClass().getName());
            }*/
           
        } catch (Exception e) {
            throw new BeansException("프로퍼티 파일 로딩 중 오류 발생!");
        }
    }
    
    public Object getBean(String name) {
        Object bean = pool.get(name);
        if (bean == null)
            throw new BeansException("빈을 찾을 수 없습니다");
        return bean;
    }
    
    public void addBean(String name, Object bean) {
        pool.put(name, bean);
    }
    
    public String[] getBeanDefinitionNames() {
        Set<String> keySet = pool.keySet();
        String[] names = new String[keySet.size()];
        
        keySet.toArray(names);
        
        return names;
    }
    
    private void injectDependency() {
        
        Collection<Object> objs = pool.values();
                
        for (Object obj : objs) {
            //System.out.println(obj.getClass().getName());
            invokeSetter(obj);
        }
    }
    
    private void invokeSetter(Object obj) {
        
        Method[] methods = obj.getClass().getMethods();
        
        for (Method m : methods) {
            //System.out.println("=>" + m.getName());
            if (!m.getName().startsWith("set")) continue;

            Object dependency = findObject(getFirstParameterType(m));
            
            if (dependency == null) continue; 

            try{
                m.invoke(obj, dependency);
//                System.out.printf("%s.%s() 호출됨!\n", 
//                        obj.getClass().getName(),
//                        m.getName());

            } catch (Exception e) {
                throw new BeansException(obj.getClass().getName() + "클래스의 " + 
                        m.getName() + "메서드 호출 오류!");
            }
        }
    }
    
    private Class<?> getFirstParameterType(Method m) {
        return m.getParameterTypes()[0];
    }
    
    private Object findObject(Class<?> type) {
        
        Collection<Object> objs = pool.values();
        
        for (Object obj : objs) {
            if (type.isInstance(obj))
                return obj;
        }
        
        return null;
    }
    
    public void refreshBeanFactory() {
        injectDependency();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
