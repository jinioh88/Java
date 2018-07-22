#배열
1. System.arraycopy()로 배열을 복사가 효율적이다. 
  - for문 대신 사용하면 간단하고 빠르게 복사할 수 있다. 
  - for문은 요소 하나하나 접근해 복사하지만, arrayCoopy()는 지정된 범위 값들을 한번에 복사한다. 
  >
     system.arraycopy(abc,0,res,0,abc.length);
     // abc배열의 0번부터를 res의 0번 째부터로 복사한다.
  
2. String 배열
  - 배열에 실제 객체가 아닌 객체의 주소가 저장되어 있다. 
  - 기본형 배열이 아닌 경우, 배열에 저장되는 것은 객체의 주소다.
  - cahr 배열보단 String클래스를 사용하는게 문자열 다루기 쉽다. char 배열에 메서드를 추가했다. 
  - String 객체(문자열)은 읽을 수만 있고 내용 변경은 할 수 없다. 
  >     
    String str = "Hello";
    str = str ="world";  // Helloworld라는 새로운 문자열이 str에 저장됨.
  - 변경 가능한 문자열을 다루려면 StringBuffer 클래스를 이용하자. 
  - 문자열 비교는 equals()로 하고 대소문자 구분없이 하려면 equalsIgnoreCase()를 사용하자. 
  
3. 2차원 배열의 for문
  > 
    for(int[] tmp : arr1) {
        for(int i : tmp)
            sum +=i;
    }
  
  

  
  