//package StepDefintions;
//
//import io.cucumber.core.api.TypeRegistry;
//import io.cucumber.core.api.TypeRegistryConfigurer;
//
//public class logincredentialsmapping implements TypeRegistryConfigurer{
//	
//	public void configureTypeRegistry (TypeRegistry typeRegistry) {
//		
//		typeRegistry.defineDataTableType{
//			new DataTableType (logiccredentials.class, new TableEntryTransformer<logincredentials>()
//					
//					{
//				public logincredentials transform (Map<String, String> entry ) throws Throwable
//					return logiccredentials.createlogincredentials(entry);}
//			
//		
//		
//		
//	
//	
//	}
//	
//
//
//
