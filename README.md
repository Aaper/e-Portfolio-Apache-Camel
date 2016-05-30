# e-Portfolio-Apache-Camel
Repository for e-Portfolio presentation

This Repository provides an easy demo code to show the basic concepts of Apache Camel.
Furhter information to the demo code can be found in the document "Demo_Erläuterung.pdf".

## Run the project
To run the demo simply import the project located in direcotry lösung into your Eclipse IDE and run "maven install".

## Exercise
1. Import the project located in directory aufgabe into your Eclipse IDE
2. In class CamelStarter define the CamelContext and load the Route defined in class IntegrationRoute into the CamelContext. Start the Context, wait 30 Secounds and stop the Context aferwards.
3. Define the Route to use in the CamelContext in Class IntegrationRoute.
  The Route should consume a file of directory "orders/inbox",
  send it to the predefined processor "LoggingProcessor",
  afterwards redirect it to the predefined bean "TransformationBean",
  unmarshal the Message and split it after each ","
   and finally write the new produces messages, depending on their conntent, into a file in folder "DVD", "CD", or "others"
