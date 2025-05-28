
def call() {
    pipeline {
        agent any

        stages {
            
            stage('Clean') {
                steps {
                    deleteDir()
                }
            }

            stage('Checkout') {
                steps {
                    checkout scm
                }
            }

            stage('Install') {
                steps {
                    sh "npm install"
                }
            }

            stage('Run') {
                steps {
                    sh "npm start"
                }
            }

            stage('Test') {
                steps {
                    sh "curl -f http://localhost:3001"
                }
            }

            stage('Cleanup') {
                steps {
                    deleteDir()
                }
            }
        }
    }
}