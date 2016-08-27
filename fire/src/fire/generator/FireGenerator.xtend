package fire.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fire.fire.Program

class FireGenerator extends AbstractGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val outputMessage = (resource.contents.head as Program).value
		fsa.generateFile(resource.URI.trimFileExtension.lastSegment + ".ll", '''
			@0 = private unnamed_addr constant [«outputMessage.length + 1» x i8] c"«outputMessage»\00"
			
			declare i32 @puts(i8*)
			
			define void @main() {
			entry:
				%0 = call i32 @puts(i8* getelementptr inbounds ([«outputMessage.length + 1» x i8], [«outputMessage.length + 1» x i8]* @0, i32 0, i32 0))
				ret void
			}
		''')
	}
}
