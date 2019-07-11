pipeline {
  agent any
  stages {
    stage('q') {
      steps {
        sh 'mvn clean sonar:sonar'
      }
    }
  }
}