# kafka-kip-example

#Zookeeper start. 

````
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
````

# Kafka Server. 
````
.\bin\windows\kafka-server-start.bat .\config\server.properties
````


# results 

````
ConsumerRecord(topic = testSerie, partition = 0, offset = 250, CreateTime = 1555330034729, serialized key size = -1, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 1)
ConsumerRecord(topic = testSerie, partition = 0, offset = 251, CreateTime = 1555330034744, serialized key size = -1, serialized value size = 1, headers = RecordHeaders(headers = [], isReadOnly = false), key = null, value = 2)


````
