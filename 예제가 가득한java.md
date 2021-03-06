# 예제가 가득한 Java
## 래퍼 클래스란?
  - 컬렉션 클래스에는 객체만 저장할 수 있다. 이 경우 기본형을 감싸기 위한 클래스가 래퍼클래스이다. 

  -컬렉션의 remove()는 인덱스의 요소와 지정한 객체를 삭제할 방법이 있다.

 ```java
    javalist.remove(new Integer(i));  // 지정한 객체를 삭제하는 방법
 ```
## Optional이란?
  - java8에서 도입된 컨테이너 클래스로 존재할지 여부를 모르는 값을 표현하기 위한 것이다.
  - 존재하지 않을 가능성이 있음을 명시할 수 있고 의도하지 않는 오류를 막을 수 있다. 
### Optional 기본 사용법
  - OptionalInt, OptionalLong, 과 같은 전용 클래스가 준비돼 그냥 Optional을 사용하는 것보다 효율적이다(형변환 측면)
  - get() 메서드로 값을 구할 수 있다. 값이 존재하지 않으면 예외 발생
  - orElse(), orElseGet()으로 값이 존재하지 않을 경우 기본값을 설정하거나 , orElseThrow()로 예외를 발생할 수 있다. 
  - isPresent()로 값이 있는지 확인할 수 있다. 
  - ifPresent()로 값이 있다면 람다식 사용할 수 있다. 
  - Optional에 filter()나 map()으로 값을 필터할 수 있다. 
## switch 조건 분기하기
  - 식이 null인 경우 if else switch를 사용하면 안전하다.
  ```java
    if(str==null) {
        // null 처리
    } else {
        swith(str) {
            //case 처리
        }
    }
  ```
## 예외
### 여러개 예외 같이 캐치하기
  - 상속 관계에 있는 클래스는 동시에 캐치할 수 없다.
  ```java
    try {} catch(FileNotFoundException | IoException e) {}  // 컴파일 오류난다.
  ```
## 리소스를 확실하게 닫기
  - try-with-resource문은 try 블록내에 예외 발생 여부 관계없이 리소스 닫는 것이 보장 됬다. 
  - catch와 finally블럭도 선언할 수 있는데, try-with-resource 문 처리가 끝나고 실행된다. 즉 리소스를 닫은 후 처리된다. 
  - java8부터 람다식과 익명클래스에서 값의 변경이 이러지지 않은 변수에 대해 실질적으로 final로 취급되어 final이 붙지 않아도 외부 변수가 참조 가능해졌다.
## 문자열
### 문자열 연결하기
  - String.join()으로 저장된 문자열을 지정한 구분 문자영ㄹ로 연결할 수 있다.
  - +로 리터럴 연결 처리는 효율에 나쁘지 않다. 다만 변수와 리터럴과 같은 변수의 문자열 연결은 주의가 필요하다.
### 문자열 나누기
  - split()으로 첫번째 인수에 정규표현식이 오고, 두번째 인수에 분리하는 갯수를 입력한다. 
  - 두번째 인자로 배열의 최대 요소수를 입력하면 끝에 요소가 빈 문자열인 경우에도 분할 배열에 포함된다. 
### 문자열 바꾸기
  - replace()를 사용하는데, 문자열을 주면 문자열이 바뀌고, char('')를 주면 1글자가 모두 바뀐다.
### 정규표현
  - 자바의 정규표현을 사용할 때 2가지 클래스를 사용한다.
  - Pattern, Mathcer
  - Pattern 클리새는 compile() 메서드로 생성한다. 
  - 문자열이 정규 표현에 맞는지 파악하고 싶을 땐, Mather클래스의 matches()를 사용한다. 

## 익명클래스
  - 익명클래스에서 외부 메서드의 로컬 변수는 final만 엑세스 할 수 있었다.
  - java8 부터는 람다가 도입되면서 익명클래스에서 접근하려는 로컬 변수에 final이 필요하지 않게 되었다. 
 
## enum
### enum 정수마다 메서드 오버라이드
  - 인터페이스와 메서드를 정의해 열거형에서 그 ㅇ니터페이스를 구현함으로 enum 정수마다 임의의 처리를 할 있다.

## Stream
  - java8 부터 컬렉션 프레임 워크에 Stream 인터페이스가 추가됨.
  - 컬렉션 요소에 대한 변환, 필터링, 집계 처리를 람다식을 사용해 간결하게 할 수 있다. 
  - 컬렉션의 조작을 병렬화 할 수 있으므로 처리를 쉽게 고속화 할 가능성이 있다. 
  - 컬렉션에서 stream() 메서들르 호출해 Stream을 구할 수 있다.
  - 배열에선 Arrays.stream()으로 스트림을 구할 수 있다.
### Stream에서 수치 다루기
  - IntStream, LongStream, DoubleStream도 구할 수 있다. 이 클래스를 사용하면 원시형을 감싸지 않아 오버헤드를 줄일 수 있다. 
  - mapToInt()등으로 stream을 IntStream등으로 변환할 수 있다.  


