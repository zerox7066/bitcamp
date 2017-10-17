//: ## String 클래스 사용법 - 기타 메서드

package bitcamp.java100;

public class Test18_5 {
    
    // entry point
    public static void main(String[] args) throws Exception {
        String s1 = "ABC가각간";
        
        // replace()
        // 새 인스턴스가 생성
        //s1 = s1.replace("BC", "하하하");    //????
        String s2 = s1.replace("BC", "하하하");
        
        System.out.println(s1);
        System.out.println(s2);
        
        // String 인스턴스의 값은 한 번 정해지면 변경할 수 없다.  "immutable object"
        
        
        // charAt(index)
        // index 은 0 부터 시작
        System.out.println(s1.charAt(4));
        
        s1 = "ABBCDEBBFGH";
        
        // indexOf(찾을 문자열)
        // 앞에서 부터 문자열을 찾는다.
        System.out.println(s1.indexOf("BB"));
        
        // lastIndexOf(찾을 문자열)
        System.out.println(s1.lastIndexOf("BB"));
        
        // substring(추출할 문자열의 시작 인텍스)
        System.out.println(s1.substring(3));
        
        // substring(추출할 문자열의 시작 인덱스, 끝 인덱스)
        // 끝 인덱스의 문자는 포함하지 않는다.
        System.out.println(s1.substring(3, 6));
        
        s1 = "홍길동";
        
        // startsWith(시작문자열)
        // 해당 문자열이 주어진 문자열로 시작하는 지 검사 : 리턴값은 true / false
        System.out.println(s1.startsWith("홍길"));
        System.out.println(s1.startsWith("길"));
        
        // endsWith
        System.out.println(s1.endsWith("동"));
        System.out.println(s1.endsWith("원"));
        
        s1 = "홍길동,유관순,임꺽정,안중근,윤봉길,이육사,윤동주";
        
        // contains(포함문자열)  : 리턴값 true / false
        System.out.println(s1.contains("꺽정"));
        System.out.println(s1.contains("김꺽정"));
        
        String s3 = "ABC";
        String s4 = "가각간";
        
        // concat(추가할 문자열) 
        System.out.println(s3.concat(s4));
        
        // 주의! 절대로 기존 String 인스턴의 값은 바뀌지 않는다.
        System.out.println(s3);
        System.out.println(s4);
        
        s3 = new String("탕수육");
        s4 = new String("탕수육2");
        String s5 = new String("탈수육");
        String s6 = new String("탕수육");
        
        // 문자열1.compareT(문자열2)  : 문자 정렬
        // 같으면 0을 리턴
        // 문자열1이 문자열2 보다 앞서면 음수를 리턴
        // 문자열1이 문자열2 보다 뒤면 양수를 리턴
        System.out.println(s3.compareTo(s6));
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s5));
        
        s1 = "홍길동";
        s2 = "";   // 빈문자열도 String 인스턴스이다.
        s3 = null;  // 인스턴스 없음
        
        // isEmpty()
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        //System.out.println(s3.isEmpty());  // 인스턴스가 없으면 실행 오류!
        
        // length()
        System.out.println(s1.length());
        System.out.println(s2.length());
        //System.out.println(s3.length());  // 인스턴스가 없으면 실행 오류!
        
        s1 = "홍길동,유관순,임꺽정,안중근,윤봉길,이육사,윤동주";
        
        // split(구분자)
        // 해당 문자열을 구분자로 분리하여 String[] 배열로 리턴
        String[] arr = s1.split(",");
        for (String s : arr) {
            System.out.print(s);
            System.out.print("-");
        }
        System.out.println();
        
        // 구분자가 없으면 문자열 그대로 배열로 리턴
        arr = s1.split(" ");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        
        // 빈문자열도 문자열이기 때문에 배열로 리턴
        s1 = "";
        arr = s1.split(",");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        
        s1 = "Hong Gil Dong";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        
        // trim()
        // 해당 문자열의 양쪽에 존재하는 공백(white space) 제거
        // 공백(white space)?
        // - 스페이스(스페이스 바를 눌러 추가한 빈 칸 한 개), 탭, 줄바꿈 모두 공백으로 취급한다.
        s1 = "  \t홍\t길 동 \n입니다. \n\n\n\t\n";
        System.out.print(">");
        System.out.print(s1.trim());
        System.out.println("<");
        
        s1 = "ABC\n가각간\n똘똠똥";
        
        // getBytes()
        // 바이트 배열에 저장되는 값은 JVM에 설정된 문자집하븨 코드 값이다.
        // JVM에 설정된 문자 집합 없으면, OS의 기본 문자 집합을 사용한다.
        byte[] bytes = s1.getBytes();
        for (byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0x00ff));
            System.out.print(" ");
        }
        System.out.println();
        
        // getBytes(문자집합)
        // 가능한 문자 집합을 명시하여 바이트 배열을 만들라!
        // OS에 상관없이 동일한 결과를 얻을 수 있다.
        bytes = s1.getBytes("UTF-8");
        for (byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0x00ff));
            System.out.print(" ");
        }
        System.out.println();
        
        // String의 클래스 메서드
        // valueOf(값)
        // 주어진 값을 가지고 String 인스턴스를 생성하는 메서드이다.
        s1 = String.valueOf(true);
        s2 = String.valueOf(3.14);
        s3 = String.valueOf(100);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        // 문자열을 다루는 특별한 연산자 '+'
        s1 = "ABC";
        s2 = "가각간";
        s3 = s1 + s2;   // 주소를 더하는게 아니다.
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        System.out.println("--------------------------------------------------");
    }
}






















