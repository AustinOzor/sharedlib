def call (){

def mavenCommand = 'mvn compile -DiskTests=true'

//Execute the Maven Command in a shell
sh 'mvn compile'
}
