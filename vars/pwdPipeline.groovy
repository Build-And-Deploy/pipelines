
def call() {

  pipeline {
    agent any

    stages {
      stage('PWD') {
        steps {
          sh "pwd"
        }
      }
    }
  }
}
