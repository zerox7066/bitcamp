//: ## String 클래스 사용법 - 정규식을 이용하여 문자열을 검사하기

package bitcamp.java100;

public class Test18_6 {
    
    // entry point
    public static void main(String[] args) throws Exception {
        String email = "hong@test.com";
        
        // match(정규표현식)
        // 정규표현식(Regular Expression)의 규칙과 맞는지 검사  true / false
        System.out.println(email.matches("1hong@test.com"));
        
        System.out.println(email.matches("^.+@.+\\..+"));
        
        // java.util.regex.Pattern 클래스이 API 문서를 참조
        System.out.println(email.matches("^\\D.+@.+\\..+"));
        
        System.out.println("--------------------------------------------------");
        
        String str = "홍길동(hong@test.com),임꺽정(leem@test.com" +
                     "유관순(yoo@test.com),안중근(ahn@test.com),윤봉길(yoon@test.com)";
        
        // 해당 문자열에서 주어진 규칙을 갖는 문자열을 찾아 출력
        // 정규표현식 규칙을 생성
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
        
        // 정규표현식
        java.util.regex.Matcher matcher = pattern.matcher(str);
        
        
        int startIndex = 0;
        while (matcher.find(startIndex)) {
            System.out.println(startIndex);
            String matcherString = matcher.group();
            
            startIndex = matcher.end();
            
            System.out.println(matcherString);
        }
        
        System.out.println("--------------------------------------------------");
        
        //int startIndex = 0;
        if (matcher.matches()) {
            for(int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println(matcher.group(i));
            }
        } else {
            System.out.println("Not Found");
        }
        
        System.out.println("--------------------------------------------------");
    }
}

//1) 숫자만 : ^[0-9]*$
//
//2) 영문자만 : ^[a-zA-Z]*$
//
//3) 한글만 : ^[가-힣]*$
//
//4) 영어 & 숫자만 : ^[a-zA-Z0-9]*$
//
//5) E-Mail : ^[a-zA-Z0-9]+@[a-zA-Z0-9]+$
//
//6) 휴대폰 : ^01(?:0|1|[6-9]) - (?:\d{3}|\d{4}) - \d{4}$
//
//7) 일반전화 : ^\d{2.3} - \d{3,4} - \d{4}$
//
//8) 주민등록번호 : \d{6} \- [1-4]\d{6}
//
//9) IP 주소 : ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3}) \. ([0-9]{1,3})



//* find()
//  - 대상 문자열에서 해당 패턴을 검색하여 일치하는 패턴이 일부라도 존재하면 true를 리턴한다.
//  - matches()에 비해서 상대적으로 활용도가 높을 것 같다.
//
//* matches()
//- 대상 문자열 전체가 해당 패턴과 일치하면 true를 리턴한다.
//- 문자열의 처음부터 끝까지 정규식을 만족시켜야 한다.(^과$가 붙었다고 생각하자)
//
//Matcher 클래스 메서드들
//find() : 패턴이 일치하는 경우 true를 반환하고, 그 위치로 이동(여러개가 매칭되는 경우 반복 실행가능)
//find(int start) : start위치 이후부터 매칭검색을 수행
//start() : 매칭되는 문자열 시작위치 반환
//start(int group) : 지정된 그룹이 매칭되는 시작위치 반환
//end() : 매칭되는  문자열 끝 다음 문자위치 반환
//end(int group) : 지정되 그룹이 매칭되는 끝 다음 문자위치 반환
//group() : 매칭된 부분을 반환
//group(int group) : 매칭된 부분중 group번 그룹핑 매칭부분 반환
//groupCount() : 패턴내 그룹핑한(괄호지정) 전체 갯수 반환
//matches() : 패턴이 전체 문자열과 일치할 경우 true 반환



















