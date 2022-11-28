# OOP 주의사항

## MVC 패턴

다음 5가지를 지키는지 확인한다.

1. Model은 Controller와 View에 의존하지 않아야 한다.
2. View는 Model에만 의존해야 하고, Controller에는 의존하면 안 된다.
3. View가 Model로부터 데이터를 받을 때는, 사용자마다 다르게 보여주어야 하는 데이터에 대해서만 받아야 한다.
4. Controller는 Model과 View에 의존해도 된다.
5. View가 Model로부터 데이터를 받을 때, 반드시 Controller에서 받아야 한다.

## TEST 만들기

1. 기능마다 작은 단위의 Test 클래스 만들자.
2. 테스트를 하기 쉬운 return이 있는 메서드로 기능을 구현한다.
3. 예외상황을 잘 생각해 Test를 만들자.

## 하드코딩 X

- 문자열, 숫자 등 상수화를 시킨다.
- Enum을 사용한다.

## 함수

- 함수는 한가지 기능만 하게 한다.
- 10라인 미만으로 연습해보자.

## 객체

- 객체는 값만 가지는게 아니라 행동을 가져야 한다.
- getter로 전달 -> 계산 보단, 객체 안에서 계산 -> 전달을 지향하자.

## MOD

- InputView는 최대한 String으로 반환하고, OutputView는 최대한 void로 하자
  -  로직을 view에서 안짜기 위한 습관.