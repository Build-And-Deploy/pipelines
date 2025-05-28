
def call() {
    pipeline {
        agent {
            docker {
                image 'node:20-alpine'
            }
        }

        stages {

            stage('Test Docker Installation') {
                steps {
                    sh "docker ps"
                }
            }
            
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
                    sh "nohup node server.js &"
                    sleep 5
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
