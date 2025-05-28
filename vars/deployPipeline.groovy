
def call() {
    pipeline {
        agent any

        stages {

            stage('Test Kubernetes') {
                steps {
                    script {
                        sh "kubectl get pods"
                    }
                }
            }
            
            stage('Clean Workspace') {
                steps {
                    script {
                        echo 'Cleaning workspace...'
                    }
                }
            }

            stage('Checkout') {
                steps {
                    script {
                        echo 'Checking out code...'
                    }
                }
            }

            stage('Build') {
                steps {
                    script {
                        echo 'Building the project...'
                    }
                }
            }

            stage('Push') {
                steps {
                    script {
                        echo 'Pushing changes to the repository...'
                    }
                }
            }

            stage('Deploy') {
                steps {
                    script {
                        echo 'Deploying the application...'
                    }
                }
            }

            stage('Test') {
                steps {
                    script {
                        echo 'Running tests...'
                    }
                }
            }

            stage('Remove') {
                steps {
                    script {
                        echo 'Removing temporary files...'
                    }
                }
            }

            stage('Final Clean') {
                steps {
                    script {
                        echo 'Final cleanup of the workspace...'
                    }
                }
            }
        }
    }
}
