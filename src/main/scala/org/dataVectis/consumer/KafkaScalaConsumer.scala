package org.dataVectis.consumer

import java.util.{Collections, Properties}

import scala.collection.JavaConverters._
import org.apache.kafka.clients.consumer.{ConsumerRecords, KafkaConsumer}



object KafkaScalaConsumer  {
  def main(args: Array[String]): Unit = {



    println("hello word ")

    val props = new Properties()
   props.put("bootstrap.servers", "localhost:9092")
   props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
   props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
   props.put("group.id", "consumer-group-1")
   props.put("enable.auto.commit", "true")
   props.put("auto.commit.interval.ms", "1000")
   props.put("auto.offset.reset", "earliest")
   props.put("session.timeout.ms", "30000")


 val topic = "testSerie"

 val consumer: KafkaConsumer[Nothing, String] = new KafkaConsumer[Nothing, String](props)

 consumer.subscribe(Collections.singletonList(topic))


 while (true) {

   val records: ConsumerRecords[Nothing, String] = consumer.poll(100)
   for (record <- records.asScala) {
     println(record)
   }
 }


    println ("every think works just fine ")
    // doing sum aggregation by key.











  }




}






