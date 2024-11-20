App1이 1chapter 숙제이고
App2가 2chapter 숙제이다.

App1을 만드는데는 문제가 별로 없었지만 App2를 만드는 과정에서 while(true)로 반복문을 시행하고 continue;로 그냥 빠져나와서 반복문 돌리면 되지 않는가?? 라는 생각이 들어서 
App1가 다르게 반복문을 돌렸는데 2chapter숙제는 생각을 해보니 값이 오류가 나면 return -1로 값을 저장해줘야 함수가 종료되기 때문에 return 문을 사용해주어  public void 함수명~~에서 오류가 생기는 문제를 int형으로 다 코드를 고치니 정상적으로 작동하였다.


continue는 현재 반복문의 남은 부분을 건너뛰고 다음 반복으로 넘어가는 역할을 한다!
return은 함수 전체를 종료하는 것이기 때문에 용도가 다르다!

라는 개념을 다시 잡았고 private을 이용해서 getter,setter 사용을 해봐서 재밌었다.
