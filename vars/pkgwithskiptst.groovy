def call() {   
     def mavenCommand = 'mvn package -DskipTests=true'

     //Execute the maven Commands in  a shell 
     sh 'mvn package -DskipTests=true'      
    
}
