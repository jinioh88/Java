#반복문

1. 향상된 반복문
 - JDK1.5부터 배열과 컬렉션에 저장된 요소 접근시 간편한 방법이 나옴
> for(타입 변수명 : 배열or컬렉션) { ... }
 - 타입에는 배열 또는 컬렉션 요소 타입이 와야한다. 
 - 저장된 값이 반복문을 돌면서 하나씩 순서대로 끄집어 낸다. 
 - 제약 요소가 있는데 바로 저장 요소를 읽어 올떄만 사용할 수 있다느 ㄴ점이다.
>
     public class ex1 {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            int sum = 0;
        
          for(int n : arr) {
            sum+=n;
            }
            System.out.println(sum);
        }
    } 
    
2. break문은 자신이 포함된 가장 가까운 반복문을 벗어난다. 
 - 이름 붙은 반복문
 >
    public class ex2 {
     public static void main(String[] args) {
         L1 : for(int i=1;i<10;i++) {
             for(int j=1;j<10;j++) {
                 if(j==3)
                     break L1;
                 if(j==6)
                     break;
             }
         }
     }
    } 
 - break L1을 하면 가장 가까운 반복문이 아닌 L1이 붙은 반복문을 빠져나오게 된다. 
   