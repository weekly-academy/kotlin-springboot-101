# kotlin-springboot-101
---
## 주요 기능 사항 정리

### WORDLE 게임 조건
* 하루 한번만 문제를 풀 수 있는 기능
* 5자리 문자를 입력 받는다
    * 작거나 크면 입력 불가
* 사전에 있는 단어만 입력 가능
    * 사전에 없다면 입력 불가
* 게임 할 수 있는 기회는 6회(그 이상 진행 할 수 없다)
    * 5자리 모두 6회 전에 맞추었을 경우 게임 종료
    * 맞추지 못 했을 경우 해당 정답 제시하는 기능

### WORDLE 게임
* 입력한 5자리 문자와 정답인 5자리 문자를 비교
    * 위치와 문자 모두 같다면 __녹색__
    * 위치는 다르지만 해당 문자를 포함한다면 __노란색__
    * 정답 문자에 없는 경우 __회색__
    * 입력한 문자 중 정답 문자에 중복 있을 경우 우선 순위 결정
      * 위치 + 값 >> 위치 >> 일치 x
        * ex) april -> apple 일 때 p는 녹색으로 표시(2번째 p와 일치)

### WORDLE 게임 결과
* 결과를 공유 할 수 있는 기능
    * SNS를 통한 공유
    * 게임 결과를 공유 할 수 있는 기능