
keytool ��JDK�ṩ��֤�����ɹ��ߣ����в������÷��μ�keytool �Chelp
-genkey ������֤��
-v ��ϸ��Ϣ
-alias tomcat �ԡ�tomcat����Ϊ��֤��ı�����������Ը�����Ҫ�޸�
-keyalg RSA ָ���㷨
-keystore /tmp/tomcat.keystore ����·�����ļ���
-dname "CN=127.0.0.1,OU=pde,O=pde,L=Peking,ST=Peking,C=CN" ֤�鷢������ݣ������CNҪ�뷢����ķ�������һ�¡��������������Լ����е�֤�飬�������������ʣ���Ȼ���о�����ʾ
-validity 3650֤����Ч�ڣ���λΪ��
-storepass pdepde ֤��Ĵ�ȡ����
-keypass pdepde ֤���˽Կ

���ɷ����֤��
keytool -genkey -v -alias jetty -keyalg RSA -keystore jetty.keystore -validity 3650 -storepass changeit -keypass changeit

���ɿͻ���֤��
keytool -genkey -v -alias client -keyalg RSA -storetype PKCS12 -keystore client.p12 -validity 3650 -storepass changeit -keypass changeit

�����ͻ���֤��
keytool -export -alias client -keystore client.p12 -storetype PKCS12 -storepass changeit -rfc -file client.cer

�ѿͻ���֤���������֤�������б�
keytool -import -alias client -v -file client.cer -keystore jetty.keystore -storepass changeit

���������֤��
keytool -export -alias jetty -keystore jetty.keystore -storepass changeit -rfc -file jetty.cer

���ɿͻ��������б�
keytool -import -file jetty.cer -storepass changeit -keystore client.truststore -alias jetty

����֤������
keytool -certreq -alias jetty -file jetty.csr -keystore jetty.keystore