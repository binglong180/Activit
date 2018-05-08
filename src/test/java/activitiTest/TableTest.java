package activitiTest;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

public class TableTest {
	@Test
	public void creatTable(){
		ProcessEngineConfiguration configuration=ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration();
		String jdbcDriver="com.mysql.jdbc.Driver";
		String jdbcUrl="jdbc:mysql://10.0.0.13:3306/activiti";
		String jdbcUsername="root";
		String jdbcPassword="root";
		configuration.setJdbcDriver(jdbcDriver);
		configuration.setJdbcUrl(jdbcUrl);
		configuration.setJdbcUsername(jdbcUsername);
		configuration.setJdbcPassword(jdbcPassword);
		/*
  		public static final String DB_SCHEMA_UPDATE_FALSE = "false";//必须有表
  		public static final String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop";//删除原表后新建
  		public static final String DB_SCHEMA_UPDATE_TRUE = "true";//无表新建
		 * */
		configuration.setDatabaseSchemaUpdate(configuration.DB_SCHEMA_UPDATE_TRUE);
		ProcessEngine processEngine = configuration.buildProcessEngine();
		System.out.println(processEngine);
	}
	
	@Test
	public void createTableByConfig(){
		String resource="activiti.cfg.xml";
		ProcessEngine processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource(resource).buildProcessEngine();
		System.out.println(processEngine);
	}
}
