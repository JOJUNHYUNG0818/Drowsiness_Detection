# CNN_Drowsiness_Detection

이 프로젝트는 웹캠 영상을 기반으로 운전자의 졸음 상태를 감지하고 경고하는 프로그램
OpenCV와 Keras를 사용하여 구현되었으며, Firebase를 통해 데이터를 저장할 수 있습니다.

# 사용한 라이브러리

- OpenCV
- Keras
- NumPy
- Pygame
- Tkinter
- PIL
- Firebase Admin SDK

# OpenCV
- Face Detection: `cv2.CascadeClassifier`를 이용한 Face Detection
- Eyes Detection: 왼쪽과 오른쪽 눈을 각각 Detection하기 위한 Haar Cascades 사용
  
![졸음운전](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/279216dc-5291-48bd-bf74-aa668d036537)

# 모델학습1
- 약 20000장
- train 대비 validation 30% 사용
- Backbone VGG16 아키텍처 참조하여 layer층 구성
  
![model1](https://github.com/ljxxyxxg/AI_Project/assets/152591039/5318acc7-cb67-4bd5-9cfb-4025e6d6963f)
<img width="543" alt="vgg_16" src="https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/e0307082-500b-4a9f-b200-d1ea10b8c4ee">

# 환경

1. Python 3.8 버전이상.
2. 필요한 라이브러리를 설치합니다. (`pip install opencv-python keras numpy pygame pillow firebase-admin 등`)
3. `Firebase참조.json` 파일에 Firebase 프로젝트의 인증 정보를 제공합니다.
4. `CNN__model.h5`와 `haarcascade` 폴더를 포함한 모든 필요한 파일을 프로젝트 폴더에 추가합니다.
5. 코드를 실행합니다. (`detectionButton.py`)
6. GUI를 통해 시스템을 시작, 중지, 재시작 할 수 있습니다.

# Android 앱 실행 방법

1. Android Studio를 사용하여 프로젝트를 엽니다.
2. Firebase Console에서 Firebase 프로젝트를 생성하고, Realtime Database를 설정합니다.
3. `google-services.json` 파일을 프로젝트에 추가합니다.
4. Firebase Realtime Database에 데이터가 저장되고, Android 앱에서 해당 데이터를 읽어와 표시합니다.

# Dataset 캐글 참조
https://www.kaggle.com/datasets/prasadvpatil/mrl-dataset

# 실행화면 
- CCTV 메인 화면
 
![메인화면](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/b5285fa2-2244-4f1d-aca2-064b81cc5fec)

- 안전 상태 opene yes
 
  ![blackopen](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/d679a42c-9cee-40dd-b3df-44fd7c9f6d00)
  
- 안전 상태 close eyes (Score +1)
  
![blackclose](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/eaab1b42-0a4c-4875-ad47-b604573e1f7b)

- Score 10 이상시 레드 화면 open eyes( Score -1) 
 
![redopen](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/dee0f54b-3ecb-4058-8a95-08fe7183c878)

- Score 10 이상시 레드 화면 close eyes (Score +1)

![redclose](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/520745f9-3e27-4435-a5a0-05b409629647)

- 졸음운전 기록 앱으로 받아오기
  
![졸음운전2](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/30ff11c1-42d2-4651-a610-caf4bfc244ff)

# 참고영상
https://github.com/ljxxyxxg/AI_Project/assets/152591039/1ef58427-bbe8-4a86-9e20-34dda87ce604


## 1차 업데이트 ( 운전시간 타이머 추가 )
**-- 운전 시작전 상태 --**

![운전시간(전)](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/a4b910e9-5c1c-4166-90a0-2247dce6a1de)


**-- 운전 시작후 상태 --**

![운전시간(후)](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/17d8e5f7-0710-4f6e-b672-dc04eef0d713)

**-- 추가 코드 --**

![코드구현](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/c18db118-faeb-4c85-a330-c74f5adc0a05)


## 2차 업데이트 ( 교통사고 정보 가져오기 //Open API )
## Android Studio 
**-- Retrofit로 Key값 전달해 실시간 교통사고 정보 Json 파일로 가져옴 --**

![중요코드2](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/035547bf-0ef4-4ae4-be67-52da1a5de203)

**-- 교통사고 Json 파일 --**

![json오픈api](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/8fe6e320-576d-43e9-a87a-7ab5ccf3d381)

**-- Android Studio로 Json 읽어 주는 코드 구현 --**

![중요코드3](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/eb61e43d-85b0-4183-b911-e726da8d579b)

**-- 앱 실행화면 --**

![오픈api 사고정보](https://github.com/JOJUNHYUNG0818/Drowsiness_Detection/assets/152590602/02f4a1ae-4ef9-4a27-b9fc-7d040efb6869)




