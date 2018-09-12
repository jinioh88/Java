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
  
## 상속과 리플렉션
### 클래스 확장하기
#### 메서드 오버라이딩
  - 서브 클래스 메서드는 슈퍼클래스의 비공개 인스턴스 변수에 직접 접근할 수 없다.
  - 그래서 공개 메서드를 호출해 이용하도록 한다. 
  - 오버라이드 할라면 매개변수가 같아야 하는데 다르게 쓸 수 있는 실수를 할 수 있다. 이를 방지하려 오버라이드 메서드에 @Override를 붙이자.
  - 메서드를 오버라이드 할 반환 타입을 서브타입으로 변경할 수 있다. 
#### 서브클래스 생성
  - 하위 클래스에서 부모 클래스의 비공개 인서턴스 변수에 접근할 수 없으니 슈퍼클래스 생성자로 해당 인스턴스 변수를 초기화해야 한다.
    >
        pubilc Manager(String name, double salary) {
            super(name, salary);
            bounus = 0;
        }
  - super는 반드시 첫번째 문장에 와야한다.
#### 추상 메서드와 추상 클래스
  - 추상 클래스의 인스턴스는 생성할 수 없다.
  - 하지만 변수에 구체적인 서브클래스의 객체 참조를 담으면 클래스 타입으로 변수를 선언하는 것은 가능하다. 
    >   Person p = new Student("OH",1988); // Person이 추상클래스 일때
#### 보호접근
  - 메서드를 서브 클래스 전용으로 제한하거나, 서브클래스 메서드에서 슈퍼클래스의 인스턴수 변수에 접근하고 싶을때 protected를 선언한다.
  - 해당 변수를 가진 클래스가 속한 패키지와 같은 패키지에 속한 모든 클래스가 이 필드에 접근 가능하다. 
  
### Object: 보편적 슈퍼클래스
#### toString 메서드
  - Object에 정의된 toString 메서드는 클래스명과 해시코드를 출력한다. 
  - 베열 내용을 출력하고자 할떈 Arrays.toString(배열명); 형식을 이용하자. 
#### equals 메서드
  - Object의 equals는 두 객체에 대한 참조가 같은지 판한다.
  - 두 내요이 같은지 보려면 equals를 오버라이드 한다. String 클래스는 두 분자열이 같은지 오버라이드 했다. 
  - equals를 오버라이드 할때 이와 호환되는 hashCode 메서드도 반드시 제공해야 한다. 
  - 인스턴스 변수가 배열이면 Arrays.equals를 사용해 배열의 길이가 같은지 검사하고, 대응하는 배열 요소를 검사한다. 
  
### 열거
#### 열거의 메서드
  - 열거 타입 값을 비교할 떈 '=='를 사용하라. 
  - toString 대신 valueOf가 있다. 주어진 이름에 해당하는 인스턴스가 없으면 예외를 던진다. 
  - values는 모든 인스턴스를 선언한 순서로 정렬한 배열을 반환한다. 
  
