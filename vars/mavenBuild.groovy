def call(){
    bat 'mvn -B test'
    bat 'mvn -B package -DskipTests'
}