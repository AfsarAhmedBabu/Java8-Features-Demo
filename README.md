# Java8-Features

Stream represents a sequence of ojects from a source, then performs aggregate operations and return the list


Stream takes Collections, Arrays, I/O resources as input

Operations: filter, map, limit, sorted, reduce, find, match, parallel processing, statistics

.collect() method marks the end of pipelining

stream does the iteration internally

java.time package has the new date/time classes:

LocalDate, LocalTime, LocalDateTime


Functional interface can have only one abstract method and any number of default and static methods

lambda expression is the implementation of functional interface, so the result of lambda expression can be assigned to functional interface

method reference is the alternative of lambda expression. it is used to map exisiting method implementation to abstract method of functional interface

To reuse existing implementation use method reference but for new code use lambda expression

Consumer can have parameters, but provider can not have parameters, just provides output
