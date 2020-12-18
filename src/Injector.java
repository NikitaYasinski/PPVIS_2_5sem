import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import first.AuthorInfoStorageReader;
import first.AuthorInfoWikiReader;
import first.AuthorService;
import first.BookInfoStorageReader;
import first.BookInfoWikiReader;
import first.BookListService;
import first.BookService;
import second.BooksHandler;
import second.CreateLibraryButton;
import second.OneAuthorHandler;
import second.OneBookHandler;
import second.SignupButton;
import second.SignupHandler;
import third.AuthenticationService;
import third.FingerprintPasswordReader;
import third.StringPasswordReader;

public class Injector {
	
	public Injector() {
		BookService bookService = new BookService();
		AuthorService authorService = new AuthorService();
		StringPasswordReader reader = new StringPasswordReader();
		BookListService bookListService = new BookListService();
		AuthenticationService authService = new AuthenticationService();
		FingerprintPasswordReader fReader = new FingerprintPasswordReader();
		SignupHandler sHandler = new SignupHandler();
		BooksHandler bHandler = new BooksHandler();
		OneBookHandler oBHandler = new OneBookHandler();
		OneAuthorHandler oAHandler = new OneAuthorHandler();
		BookInfoStorageReader biReader = new BookInfoStorageReader();
		BookInfoWikiReader biwReader = new BookInfoWikiReader();
		AuthorInfoStorageReader aReader = new AuthorInfoStorageReader();
		AuthorInfoWikiReader awReader = new AuthorInfoWikiReader();
		
		JFrame jFrame = new JFrame();
		jFrame.setSize(1000, 500);
		JPanel jPanel = new JPanel();
        CreateLibraryButton createLibraryButton = new CreateLibraryButton();
        createLibraryButton.setText("Create library");
        createLibraryButton.setPreferredSize(new Dimension(400, 50));
        SignupButton signupButton = new SignupButton();
        signupButton.setText("Login to library");
        jPanel.setLayout( new GridBagLayout() );
        signupButton.setPreferredSize(new Dimension(400, 50));
        jPanel.add(createLibraryButton, new GridBagConstraints());
        jPanel.add(signupButton, new GridBagConstraints());
        jFrame.add(jPanel);
        jFrame.setVisible(true);
	}
	
}
