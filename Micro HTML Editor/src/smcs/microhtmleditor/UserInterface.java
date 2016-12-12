package smcs.microhtmleditor;

import javax.swing.filechooser.FileNameExtensionFilter;

public class UserInterface implements EditorController{
	private DocumentManager documentManager;
	private EditorView editorView;
	
	public UserInterface(DocumentManager dm, EditorView ev) {
		documentManager = dm;
		editorView = ev;
		editorView.registerOpenMenuHandler(this);
		editorView.registerSaveMenuHandler(this);
		editorView.setEditorDocument(documentManager.getDocument());
	
		JFileChooser();
	//	JFileChooser().showDialog(UserInterface.this);
		
	}

	public void open() {
		System.out.println("Open");
	}
	
	public void save() {
		System.out.println("Save");
		
	}
	
	public void JFileChooser(){
		 FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "html");
	}
	
}