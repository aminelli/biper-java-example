pipeline {

    agent any

    stages {

        stage('Compile') {
            steps {
                withMaven(maven: 'MVN_3_9_6') {
                    sh 'mvn -f pom.xml clean compile'
                }
            }
        }


        stage('Unit Test (Junit)') {
            steps {
                withMaven(maven: 'MVN_3_9_6') {
                    sh 'mvn -f pom.xml test'
                }
            }

            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }

        stage('Package (Artifact install)') {
            steps {
                withMaven(maven: 'MVN_3_9_6') {
                    sh 'mvn -f pom.xml install'
                }
            }
        }

    }


}