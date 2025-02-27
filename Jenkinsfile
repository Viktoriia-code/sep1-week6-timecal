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
    }
}
