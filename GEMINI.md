# Gemini Interaction Guidelines & History

이 문서는 프로젝트 내에서 알고리즘 문제 추가 및 관리 시 Gemini 에이전트가 준수해야 할 규칙과 수행한 주요 작업들을 정리한 파일입니다.

## 1. 문제 파일 생성 규칙 (Problem Templates)
- **경로**: `src/programmers/`
- **방식**: 문제 추가 요청 시, 정답 코드가 아닌 프로그래머스에서 제공하는 **초기화 코드(메서드 시그니처 및 기본 리턴값)**만 포함된 템플릿 파일을 생성합니다.
- **예시**:
  ```java
  package programmers;
  public class 클래스명 {
      public int solution(int[] array) {
          int answer = 0;
          return answer;
      }
  }
  ```

## 2. 테스트 케이스 관리 (Main.java)
- 새로운 문제가 추가되면 `src/Main.java`의 `main` 메서드에 해당 문제를 테스트할 수 있는 코드를 추가합니다.
- 기존의 테스트 케이스들과 일관된 형식을 유지합니다.
- 필요 시 `import` 구문을 추가하여 클래스를 참조할 수 있도록 합니다.

## 3. Git 커밋 메시지 가이드 (Git Commit Convention)
- 커밋 메시지는 작업 내용을 명확히 알 수 있도록 작성하며, 특히 알고리즘 문제 풀이의 경우 **각 문제별 핵심 로직을 간략하게 요약**하여 포함합니다.
- **형식**:
  ```
  feat: <작업 요약>

  - 문제명1: <핵심 로직 요약>
  - 문제명2: <핵심 로직 요약>
  ```
- **예시**:
  - `칠의개수: StringBuilder를 사용하여 숫자를 문자열로 변환 후 '7' 카운트`
  - `머쓱이보다키큰사람: Stream API를 사용하여 내림차순 정렬 후 비교`

## 4. 커밋 실행 가이드 (Commit Execution Guide)
- **멀티라인 메시지 처리**: 커밋 메시지가 길거나 여러 줄(Multi-line)로 구성된 경우, 쉘 명령어 파싱 오류를 방지하기 위해 **반드시** 별도의 텍스트 파일(예: `commit_msg.txt`)에 메시지를 작성한 뒤 `git commit -F <파일명>` 옵션을 사용하여 커밋합니다.
  - **권장 절차**:
    1. `write_file`: `commit_msg.txt` 생성 (메시지 내용 작성)
    2. `run_shell_command`: `git commit -F commit_msg.txt`
    3. `run_shell_command`: `del commit_msg.txt` (Windows) 또는 `rm commit_msg.txt` (Mac/Linux)

---
*최종 업데이트: 2025-12-26*