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
## 문자열 연결하기
  - String.join()으로 저장된 문자열을 지정한 구분 문자영ㄹ로 연결할 수 있다. 



