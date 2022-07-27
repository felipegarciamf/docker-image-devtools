Para utilização do springboot remoto utilizando docker, deve seguir os passos de criação do build para gerar o target com o jar.

![image](https://user-images.githubusercontent.com/28828127/180907791-8a6d70e0-0a3a-46f3-a3f0-c848a422fd75.png)


Também deve ter o arquivo Dockerfile que será utilizado para fazer os comandos de criação de container:

![image](https://user-images.githubusercontent.com/28828127/180907883-f46c4323-8ead-41f5-8123-498991367e12.png)

Deve ser incluido o devtools no pom xml e também incluído a configuração no plugin do spring boot informando para ser falso a exclusão do dev tools na geração do build:

![image](https://user-images.githubusercontent.com/28828127/180908180-f9e9e843-da09-4ec3-aa9b-58b4ba9af544.png)


![image](https://user-images.githubusercontent.com/28828127/180908107-98dbec55-e6bc-4484-8fae-2b7db38a4abc.png)


Deve ser incluido no arquivo de properties a secretkey para poder se comunicar ambiente docker remoto:

![image](https://user-images.githubusercontent.com/28828127/180908309-2ae751e1-4cd9-4824-954c-ec602ebe58f0.png)


![image](https://user-images.githubusercontent.com/28828127/180908344-a5ceb11e-d936-49eb-b9f3-3102fd219456.png)


Após regerar o build e criar a imagem docker dele, basta configurar na sua IDE no RUN COnfigurations, incluindo a url localhost e a porta que voce subiu o docker, junto com a secret key:


![image](https://user-images.githubusercontent.com/28828127/180908450-20cba716-ab94-4224-94f7-8edb961e21c1.png)



Após estas configurações e ter feito o mvn install para criação do jar, deve ser feito o build deste docker: 

docker build -t spring-app . 

Após ser gerado o build da imagem docker rodar o comando: 

docker run -p 8080:8080 spring-app

e apertar o run do eclipse com a configuração do sprinngboot client.


Agora você pode fazer qualquer alteração no seu código que automáticamente será atualizado no ambiente DOCKER!

