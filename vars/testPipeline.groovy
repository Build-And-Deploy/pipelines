
def call() {
    pipeline {
        agent any 

        stages {
            stage('Test') {
                steps {
                    echo 'Global Pipeline Running!'
                }
            }
        }
    }
}