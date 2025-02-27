pipeline {
 agent any 
  stages {
    stage ('checking'){
      steps {
        git branch: 'master', url: 'https://github.com/ADirin/sep1_week6_timecal_demo.git'
        
      }
    }

    stage ('build') {
      steps{
        bat 'mvn clean install'
      }
     }

     stage('Test & Coverage') {
            steps {
                bat 'mvn test jacoco:report' // Runs tests & generates JaCoCo coverage report
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml' // Publish JUnit test results
                    jacoco execPattern: '**/target/jacoco.exec', // Reads JaCoCo execution file
                           classPattern: '**/target/classes',
                           sourcePattern: '**/src/main/java',
                           exclusionPattern: '**/test/**'
                }
            }
  }
  
}
}
