pipeline {
	agent  any

	options {
        ansiColor('xterm')
      }

      environment {
              MAVEN_OPTS = '-Djansi.force=true'
          }


	stages {
		stage('Prepare') {
			steps {
				checkout scm
				sh 'ls -la'
			}
		}

		stage('Run tests') {
			steps {

					sh '/Applications/apache-maven-3.6.1/bin/mvn test'


			}
		}

		stage('reports') {
            steps {
            script {
                    allure([
                            includeProperties: false,
                            jdk: '',
                            properties: [],
                            reportBuildPolicy: 'ALWAYS',
                            results: [[path: 'target/allure-results']]
                    ])
            }
            }
        }
	}
	post {
		always {
			echo 'Cleaning Workspace'


		}
		success {
			echo 'Successfully!'

		}
		failure {
			echo 'Failed!'
		}
		unstable {
			echo 'This will run only if the run was marked as unstable'
		}
		changed {
			echo 'This will run only if the state of the Pipeline has changed'
		}
	}
}
