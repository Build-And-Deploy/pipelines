
def call(name) {
    pipeline {
        agent any 

        stages {
            stage('Print') {
                steps {
                    script {
                        echo "Hello, ${name}!"
                    }
                }
            }
        }
    }
}