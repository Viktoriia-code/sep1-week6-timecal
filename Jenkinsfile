pipeline {
  agent any
    stages {
      stage ("checking"){
        steps {
          git branch: "main", url: "https://github.com/Viktoriia-code/sep1-week6-timecal.git"
        }
      }

      stage (build) {
        steps{
          bat 'mvn clean install'
        }
      }

      stage('Test & Coverage'){
        steps{
          bat 'mvn test jacoco report'
        }
        post {
          always {
            junit 'target/surefire-reports/*.xml'
            jacoco execPattern: '**/target/jacoco.exec',
                  classPattern: '**/target/classes',
                  sourcePattern: '**/src/main/java',
                  exclusionPattern: '**/test/**'
          }
        }
      }
    }
}
