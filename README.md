# project-generator
## 프로젝트 구조
``` kotlin
📁 app
│   📁 MainActivity.kt
📁 buildSrc
│   📁 CommonGradlePlugin.kt
│   📁 ComposeGradlePlugin.kt
│   📁 ProjectProperties.kt
│   📁 GradlePluginExtentions.kt
📁 designsystem
│   📁 ui
│      📁 theme
│         📁 Colors.kt
│         📁 Theme.kt
│         📁 Typography.kt
│   📁 utils
│      📁 KeyboardAsState.kt
📁 libs.versions.toml
```

## 파일 설명

## ```buildSrc```

**```CommonGradlePlugin.kt```**
- data 및 domain 등 전체 모듈에서 공통으로 사용될 gradle 속성들을 모아놓은 파일

**```ComposeGradlePlugin.kt```**
- feature 모듈, 즉 Compose를 사용하는 모듈의 gradle 속성들을 모아놓은 파일

**```ProjectProperties.kt```**
- gradle 파일의 상수들 선언해놓은 파일 (min sdk, compile sdk, jvm target..)

**```GradlePluginExtensions.kt```**
- ```CommonGradlePlugin.kt```, ```ComposeGradlePlugin.kt```에서 사용하는 gradle 속성 확장함수들 모아놓은 파일


## ```design system```

**```Color.kt```**
- 색상 정의해둘 수 있도록 세팅해놓은 파일

**```Theme.kt```**
- App Theme 및 light color, dark color 설정할 수 있도록 세팅해둔 파일

**```Typography.kt```**
- typography 정의할 수 있도록 세팅해둔 파일

**```KeyboardAsState.kt```**
- 앱에서 키보드가 올라왔는지를 boolean 값으로 반환하는 함수가 포함된 파일


## ```Gradle```

**```libs.versions.toml```**
- gradle version catalog 적용을 위한 파일 (retrofit, hilt, coil..) 의존성도 포함되어 있음


## 사용 시

**1. 자바 버전 변경하기**
   - Preferences | Build, Execution, Deployment | Build Tools | GradlePreferences | Build, Execution, Deployment | Build Tools | Gradle -> JDK 버전 18로 변경하기

**2. 모듈 이름 변경하기**
   - 각 모듈의 gradle 파일에서 namespace 속성의 패키지명을 변경하기
     
**3. design system 네이밍 스타일 통일하기(선택)**
   - Theme, Color, Typography 네이밍 스타일을 프로젝트 이름에 맞게 변경하기   
