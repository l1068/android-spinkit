# Android-SpinKit

>Android loading animations(Fork of - [SpinKit](https://github.com/ybq/Android-SpinKit))

## Preview

<img src="https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/screen.gif" width="240px" height="240px"/>

<img src="https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/screen2.gif" width="200px" height="200px"/>

## Gradle Dependency
1. Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
   repositories {
   ...
   maven { url 'https://jitpack.io' }
  }
}

   (or)
  
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

2. Add the dependency

```groovy
dependencies {
      implementation 'com.github.l1068:Android-SpinKit:1.0.0'
}
```

## Usage

#### Specified in the XML layout file
 ```xml
<com.thonsi.android.spinkit.SpinKitView 
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/spin_kit" 
    style="@style/SpinKitView.Large.Circle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    app:SpinKit_Color="@color/colorAccent" />         
```

#### Coding in the Activity or Fragment.
 ```java
ProgressBar progressBar=(ProgressBar)findViewById(R.id.progress);
Sprite doubleBounce=new DoubleBounce();
progressBar.setIndeterminateDrawable(doubleBounce);
```

## Style
>
 ```xml
@style/SpinKitView
@style/SpinKitView.Circle
@style/SpinKitView.Large
@style/SpinKitView.Small
@style/SpinKitView.Small.DoubleBounce
```

 Style          | Preview                                                                                                                                             
----------------|-----------------------------------------------------------------------------------------------------------------------------------------------------
 RotatingPlane  | <img src='https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/RotatingPlane.gif' alt='RotatingPlane' width="90px" height="90px"/>   
 DoubleBounce   | <img src='https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/DoubleBounce.gif' alt='DoubleBounce' width="90px" height="90px"/>     
 Wave           | <img src='https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/Wave.gif' alt='Wave' width="90px" height="90px"/>                     
 WanderingCubes | <img src='https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/WanderingCubes.gif' alt='WanderingCubes' width="90px" height="90px"/> 
 Pulse          | <img src='https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/Pulse.gif' alt='Pulse' width="90px" height="90px"/>                   
 ChasingDots    | <img src='https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/ChasingDots.gif' alt='ChasingDots' width="90px" height="90px"/>       
 ThreeBounce    | <img src='https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/ThreeBounce.gif' alt='ThreeBounce' width="90px" height="90px"/>       
 Circle         | <img src='https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/Circle.gif' alt='Circle' width="90px" height="90px"/>                 
 CubeGrid       | <img src='https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/CubeGrid.gif' alt='CubeGrid' width="90px" height="90px"/>             
 FadingCircle   | <img src='https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/FadingCircle.gif' alt='FadingCircle' width="90px" height="90px"/>     
 FoldingCube    | <img src='https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/FoldingCube.gif' alt='FoldingCube' width="90px" height="90px"/>       
 RotatingCircle | <img src='https://raw.githubusercontent.com/l1068/Android-SpinKit/master/art/RotatingCircle.gif' alt='RotatingCircle' width="90px" height="90px"/> 
