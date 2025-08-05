def call() {
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    echo "Building the app..."
                    sh './gradlew build' // or mvn clean install
                }
            }
        }
    }
}
