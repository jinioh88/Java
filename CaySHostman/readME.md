# 카이호스트만 자바 정리
  - 개인공부용 정리이므로 자세한 사항을 책을 참조하시길...
### 변수
  - BigInteger 클래스는 임의의 정밀도 정수 연산을 구현.
  - BigDecimal은 부동 소수점 수에 같은 동작을 구현
  - 정적 메서드 valuOf는 long을 BigInteger로 변환
    >
          BigInteger n = BigInteger.valueOf(9827349823798L);
          System.out.println(n);
  
          BigInteger k = new BigInteger("9309839820982");
          System.out.println(k);

### 문자열
  - 여러 문자열로 구분해 결합하려면 join 메서드를 사용하자.
    >           String names = String.join(", ","OH","KIM","PARK","YOO");
  - 최종 결과만 원할 떄 여러 문자열을 연결하는 것은 비효율적이다. StringBuilder를 사용하도록 하자. 
    >
                StringBuilder builder = new StringBuilder();
                boolean isEmpty = false;
                int i = 0;
                while(!isEmpty) {
                    i++;
                    if(i>10)
                        isEmpty = true;
                    builder.append("다음 문자 추가"+i);
                }
                String result = builder.toString();
                System.out.println(result);
  - 문자열 분리는 substring메서드를 사용하자. 메서드의 첫번쨰 인자는 추출할 문자열시작 위치. 
  - split 함수로 구분자로 문자열을 분리할 수도 있다. 
  - 두 문자열이 같은지는 equals()로 검사하자. '=='는 메모리가 같은지 검사하는 것이다. 
  - null을 검사할땐 '=='검사하자. 단 null은 빈문자열과는 다르다. 
  - 문자열을 리터럴 문자열과 비교할 땐 리터럴 문자열을 앞쪽에 두도록 하자.
    >   if("World".equals(location))...
  - String 클래스는 절대 변하지 않는다. 다만 새로운 문자열을 반환할 뿐이다. 
  
### 입력과 출력
  - 표준 입력 스트림에는 System.in이 있는데, 이 객체는 바이트 한 개를 읽어 온다. 
  - 따라서 문자열을 읽어 오려면 System.in에 연결된 Scanner를 생성해야 한다. 
    - Scanner는 입력 터미널에 보이므로 비밀번호 읽을땐 사용하지 말자. 대신 Console 클래스를 활용. 
  - nextLine()은 한 줄을 읽고, 공백으로 구분된 단어 한개를 읽어려면 next()를 쓰자. 
  
### 제어 흐름
  - 반복 횟수가 고정되 있을 땐 for 루프를 사용하자. 

### 기본 타입의 래퍼 클래스
  - 제네릭 클래스에는 기본타입을 파라미터로 사용할 수 없다. 
  - 그래서 래퍼 클래스를 사용해 처리해야 한다. (Integer, Byte, Short, Long, harcter, Float, Double, Boolean)
  - 래퍼끼리 같은지 비교할땐 '=='말고 equals 메서드를 사용해야 한다. ==, !=는 객체 참조를 비교한다. 

### 배열과 배열 리스트 복사
  - 배열 변수를 다른 배열 변수로 복사하면 두 변수가 같은 배열을 참조한다. 
  - 공유를 원하지 않는다면 Arrays.copyOf를 사용한다. 
  - 배열리스트를 복사하려면 new ArrayList<>(배열명);이렇게 하자. 
   
### 가변 인자
  - 인자를 원하는 개수만큼 전달해 함수를 만들 수 있다. 
  - 이런 메서드를 선언할 땐 타입 뒤에 '...'를 붙여 가변인자 파라미터로 선언한다. 
    >     public static double ave(double... values)  // 배열처럼 사용하면 된다. 
  - 가변 파라미터는 메서드의 마지막 파라미터여야 한다. 