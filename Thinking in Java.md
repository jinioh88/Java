# Thinking in Java
## 상속을 이용한 시스템 설계

## 문자열
### StringBuilder
  - 루프 내에서 String의 '+'를 쓰면 루프 내에서 StringBuilder가 계속 생성된다. 
    - 효율성 좀 떨어짐.
  - 루프 내에서 StringBuilder로 연결하면 하나의 StringBuilder 객체만 생성된다. 
  - 루프에서는 StringBuilder를 사용하자. 
### Formmater
  - Formatter f = new Formatter(System.out);  // 생성할떄 생성자 인자에는 보낼 위치를 넣는다. 
  - f.format("%-15s %5s %10.2f\n", name, qty, price); // c의 printf와 비슷하다. 
  - String.format()이 있는데, String을 반호나한다. format()을 한 번 호출할 필요가 있을때만 편리하다.
### 정규표현식
  - 정규표현식 기본
    - 정규표현식은 일반화된 형태로 문자열을 나타애는 방법이다. 따라서 '문자열 안에 이것들이 있으면, 내가 찾는것과 일치한다'라고 할수 있다.
    - 숫자 표현 '\d'를 표현하려면 '\\\\d' (2개적는거임, md가인식못해서 4개표시햇음) 라고 적어야 한다. 
    - 정규표현식을 간단하게 사용하는 방법은 String 클래스에 내장된 기능을 사용하는 것이다. matches("-?\\\\d+")
    - '?'부호는 다음에 나올수도 있고 안나올 수도 있고의 표시
    - '+'부호는 하나 이상의 이전 수식을 나타내기 위함. '+'는 정규표현식에서 특별한 의미를 가져서 '\\\\+'로 표시해야 한다. 
    - String의 split()은 '지정된 정규표현식과 일치하는 문자의 주변 문자열을 분리하라'의 의미다. 
    - String 클래스의 마지막 정규표현 식은 변경이다. replaceFirst(), replaceAll()
    - String이 아닌 정규표현식이 더 강력한 변경도구가 된다. 
  - Pattern과 Matcher
    - static Pattern.compile()해서 정규표현식을 컴파일하면 그 메서드의 String 인자를 기반으로 Pattern 객체로 생성된다.
    - 우리가 원하는 문자열을 matcher() 메서드의 인자로 전달하여 호출함으로써 Pattern 객체를 사용한다. 

  - StringTokenizer
    - Scanner 클래스가 나오기 전에 문자열 분할 방법으로 사용. 
    - 이제는 정규표현식과 Scanner 클래스를 사용해 더 쉽고 간결하게 사용가능