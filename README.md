# Kt_Academy_Core

이 어플리케이션은 **"코틀린 아카데미 : 핵심편"** 책의 연습문제를 풀어볼 수 있도록 제작된 연습용 앱입니다. **Kotlin**과 **Jetpack Compose**를
사용하여 클린 아키텍처, Hilt, Jetpack 라이브러리 등을 실습합니다.

### 아직은 기획 및 디자인 단계로 아래의 내용들은 모두 변경될 수 있습니다.

## 기획 및 디자인

- [기획 페이지 : Notion](https://kimkwonsu.notion.site/20f7b798791a4c12ba5154300704360f?pvs=4)
- [디자인 페이지 : Figma](https://www.figma.com/design/AHzLjo7ef7NJuJPGPKvBu6/Untitled?node-id=0-1&t=ybsuV1hqabkoKCZc-1)

## 개발 현황

- 2024.09.13
    - 프로젝트 생성 및 깃허브 레포지토리 연결
    - README 작성
- 2024.09.19
    - 스플래시 화면 구현
    - 프로젝트 패키지 구성
    - TypoGraphy 설정
    - Hilt 설정 (hilt,ksp 라이브러리 추가, Application 클래스, AppModule 생성)
    - Navigation 설정 (navigation-compose 라이브러리 추가, NavHost, NavGraph 생성)
    - OnBoarding 화면 구현
      - HorizontalPager, PageIndicator를 사용하여 화면 구현
      - SaveAppEntry, ReadAppEntry를 사용하여 앱 진입 여부 저장
      - 앱 진입 여부를 판단하여 Navigation 설정
      - LocalUserManager 구현
- 2024.09.20
  - Room 데이터베이스 설정
    - Room 라이브러리 추가
    - Entity, Dao 생성
    - Database 생성
    - Repository 구현
    - UseCase 구현

## 목차

1. [주요 기능](#주요-기능)
2. [설치 및 실행 방법](#설치-및-실행-방법)
3. [사용된 기술 스택](#사용된-기술-스택)
4. [프로젝트 구조](#프로젝트-구조)
5. [향후 계획](#향후-계획)
6. [기여 방법](#기여-방법)
7. [라이선스](#라이선스)

## 주요 기능

- 17가지 연습문제를 목록으로 제공
- 문제 풀이 페이지에서 답안을 입력하고 풀이 가능
- 풀이 기록 저장 및 학습 진도 추적 기능
- 문제 풀이 중 답안을 임시로 저장하는 기능
- 문제 풀이 후 해설 제공
- 다크 모드 지원

## 설치 및 실행 방법

이 프로젝트를 로컬에서 실행하려면 다음 단계를 따르세요:

1. 레포지토리 클론:
   ```bash
   git clone https://github.com/Kuneosu/Kt_Academy_Core
   ```

2. Android Studio에서 프로젝트 열기:
    - `File` -> `Open` -> 클론한 레포지토리 선택

3. Gradle과 프로젝트 동기화:
    - Android Studio가 자동으로 프로젝트를 Gradle과 동기화할 것입니다. 모든 의존성이 설치되었는지 확인하세요.

4. 프로젝트 실행:
    - 기기 또는 에뮬레이터를 선택하고 Android Studio에서 'Run' 버튼을 클릭하세요.

## 사용된 기술 스택

- **Kotlin**
- **Jetpack Compose**: UI 구성
- **Navigation Component**: 화면 간 네비게이션 관리
- **ViewModel**: UI 관련 데이터 관리
- **Hilt**: 의존성 주입
- **Room**: 로컬 데이터베이스 (선택 사항)
- **SharedPreferences**: 임시 데이터 저장
- **Material Design**: 스타일 및 테마

## 프로젝트 구조

이 프로젝트는 **클린 아키텍처** 원칙을 따라 구조화되어 있습니다. 앱을 여러 레이어로 나누어 관리합니다:

```
com.kuneosu.kotlinacademycore
│
├── data                // 데이터 레이어: 로컬 및 원격 데이터 소스, Repository 구현
│   ├── model           // 데이터 모델 클래스
│   ├── repository      // Repository 구현체
│   └── source          // 데이터 소스 (예: Room, SharedPreferences)
│       ├── local       // 로컬 데이터 소스
│       └── remote      // 원격 데이터 소스 (필요할 경우)
│
├── di                  // 의존성 주입 설정 (Hilt 모듈)
│   └── AppModule.kt
│
├── domain              // 도메인 레이어: UseCase 및 인터페이스
│   ├── model           // 도메인 모델 (필요할 경우 데이터 모델과 분리)
│   ├── repository      // Repository 인터페이스
│   └── usecase         // UseCases
│
├── presentation        // 프레젠테이션 레이어: ViewModel, UI, 상태 관리
│
├── ui                  // UI 관련: 테마 설정
│   └── theme           // 테마 관련 설정
│
├── util                // 유틸리티 클래스 및 확장 함수
│
└── MainActivity.kt     // 앱의 진입점 및 네비게이션 설정
```

## 향후 계획

- 더 많은 연습문제 추가
- 사용자 학습 진도 추적 기능 구현
- 복잡한 문제에 대한 추가 설명 리소스 제공

## 기여 방법

기여는 언제나 환영합니다! 문제를 발견하거나 개선 사항을 제안하고 싶다면 이슈를 열거나 풀 리퀘스트를 제출해 주세요.

## 라이선스

이 프로젝트는 MIT 라이선스에 따라 라이선스가 부여됩니다. 자세한 내용은 [LICENSE](LICENSE) 파일을 참조하세요.
