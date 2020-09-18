# Appium-react

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
            

#Android Install

       *Install JDK and set JAVA_HOME

       After install
       Run in command line:
      $/usr/libexec/java_home --v

       The terminal output should be along the lines of

      $ /Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home

       Next edit your bash_profile by editing it in vim editor. Type the following into terminal:
       vim ~/.bash_profile

       Edit bash_profile:

       export JAVA_HOME=[path of your java home]
       export PATH=$JAVA_HOME/bin:$PATH



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

