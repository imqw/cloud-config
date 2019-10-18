FROM development1/jre:1.8.0_192
MAINTAINER R&D Depart.1 <gy-yykf1b@19pay.com.cn>

RUN mkdir /log
RUN mkdir /manualcall
ADD ./target/config.jar /manualcall/
   
COPY ./run.sh /manualcall/run.sh
RUN chmod u+x /manualcall/run.sh

WORKDIR /manualcall

CMD [ "/manualcall/run.sh" ]

EXPOSE 8080
