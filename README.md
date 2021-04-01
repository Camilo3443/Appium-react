# Appium-react

### Install on Mac


   
b. install JDK para o Mac:
   http://www.oracle.com/technetwork/java/javase/downloads/index.html

c. Instalando e configurando o rbenv:
   brew install rbenv
   echo 'eval "$(rbenv init -)"' >> ~/.bash_profile
   rbenv install -l
   rbenv install 2.3.1 #Ou versão superior estável
   rbenv local 2.3.1

d. Instalar Android Studio
   https://developer.android.com/studio/index.html?hl=pt-br
   
e. Instalar Appium Desktop
   http://appium.io/ => Clique em download e baixe a versão mais recente para o seu SO
```

###  environment JAVA
```ruby
Abrir arquivo de configuração
open ~/.bash_profile

Preencher com:
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=$JAVA_HOME/bin:$PATH 
```

###  environment Android

```ruby
Abrir arquivo de configuração
open ~/.bash_profile

Preencher com:
export ANDROID_HOME=/Users/<usuario>/Library/Android/sdk
export PATH=$ANDROID_HOME/tools/bin:$PATH
export PATH=$ANDROID_HOME/tools:$PATH
export PATH=$ANDROID_HOME/platform-tools:$PATH
export PATH=$ANDROID_HOME/platform-tools/adb:$PATH
export PATH=$ANDROID_HOME/emulator/:$PATH

NOTE: Trocar o <usuario> pelo nome do seu usuário
```

 #Pre-requisites IOS TESTS:
              
                       Here’s a comprehensive list of everything you need on a fresh installation of OSX.
                       
                       Homebrew
                       Carthage
                       Node & NPM
                       libimobiledevice
                       JDK
                       Xcode
                       authorize-ios
                       ios-deploy
                       ideviceinstaller
                       ios_webkit_debug_proxy
                       Appium
                       Appium Doctor 
                       
                                      
 #IOS Install
     
                   * brew install carthage
                   * brew install libimobiledevice
                   * brew install node
                   * npm install -g authorize-ios
                   * brew install ios-deploy
                   * brew install ideviceinstallerbrew
                   * brew install ios-webkit-debug-proxy
                   * npm install -g appium@1.7.2
                   * npm install -g appium-doctor              
                                                                 
                                    
 #Xcode install

            * xcode-select --install
            * sudo xcode-sel
            



#Step run test Android/IOS:

             1. Clone this project and import as a maven project in IntelliJ or Eclipse.

             2. Run Android tests :  mvn test -Denv.OS=ANDROID

             3. Run IOS tests : mvn test -Denv.OS=IOS




# --Step run test Android/IOS JENKIN-CI:

             1. Change JenkinsFile to the desired platform

             2. Run Android tests :  mvn test -Denv.OS=ANDROID

             3. Run IOS tests : mvn test -Denv.OS=IOS




#Allure REPORTS

                  -  Start the server local
                  
            * REPORT LOCAL: mvn allure:serve

        
            * Log file location : /logfile.log


# --Create By: Eduardo Camilo


