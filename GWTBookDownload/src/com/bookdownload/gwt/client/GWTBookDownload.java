package com.bookdownload.gwt.client;

import com.bookdownload.gwt.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DatePicker;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTBookDownload implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */

	public void onModuleLoad() {

		// AUTHOR TAB FUNCTIONS
		final Button btn_submit = new Button("Submit");
		final TextBox txt_author_name = new TextBox();

		// HANDLING AUTHOR TAB
		btn_submit.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				txt_author_name.setText("Submit was clicked");
			}
		});

		RootPanel.get("txt_author_name").add(txt_author_name);
		RootPanel.get("btn_submit").add(btn_submit);

		// BOOKS TAB ADDING

		// adding llist_author
		final ListBox list_author = new ListBox();

		// for loop for each item to be added
		list_author.addItem("Author1");
		list_author.addItem("Author1");
		list_author.addItem("Author1");
		list_author.addItem("Author1");
		list_author.addItem("Author1");
		list_author.setVisibleItemCount(1);
		RootPanel.get("list_author").add(list_author);

		// adding txt_isbn
		TextBox txt_isbn = new TextBox();
		RootPanel.get("txt_isbn").add(txt_isbn);

		// adding txt_book_name
		TextBox txt_book_name = new TextBox();
		RootPanel.get("txt_book_name").add(txt_book_name);

		// adding txt_publisher_name
		TextBox txt_publisher_name = new TextBox();
		RootPanel.get("txt_publisher_name").add(txt_publisher_name);

		// adding date_picker
		DatePicker date_picker = new DatePicker();
		RootPanel.get("date_picker").add(date_picker);

		// adding list_book_category
		final ListBox list_book_category = new ListBox();

		// for loop for each item to be added
		list_book_category.addItem("Sci Fi");
		list_book_category.addItem("Spiritual");
		list_book_category.setVisibleItemCount(3);
		RootPanel.get("list_book_category").add(list_book_category);

		// adding btn_book_reset
		Button btn_book_reset = new Button("Reset");
		RootPanel.get("btn_book_reset").add(btn_book_reset);

		// adding btn_book_reset
		Button btn_book_submit = new Button("Submit");
		RootPanel.get("btn_book_submit").add(btn_book_submit);

		// ============================================
		// ============================================
		// UPDATE
		// ============================================
		// ============================================

		// adding llist_author
		final ListBox update_list_author = new ListBox();

		// for loop for each item to be added
		update_list_author.addItem("Author1");
		update_list_author.addItem("Author1");
		update_list_author.addItem("Author1");
		update_list_author.addItem("Author1");
		update_list_author.addItem("Author1");
		update_list_author.setVisibleItemCount(1);
		RootPanel.get("update_list_author").add(update_list_author);

		// adding txt_isbn
		TextBox update_txt_isbn = new TextBox();
		RootPanel.get("update_txt_isbn").add(update_txt_isbn);

		// adding txt_book_name
		TextBox update_txt_book_name = new TextBox();
		RootPanel.get("update_txt_book_name").add(update_txt_book_name);

		// adding txt_publisher_name
		TextBox update_txt_publisher_name = new TextBox();
		RootPanel.get("update_txt_publisher_name").add(update_txt_publisher_name);

		// adding date_picker
		DatePicker update_date_picker = new DatePicker();
		RootPanel.get("update_date_picker").add(update_date_picker);

		// adding list_book_category
		final ListBox update_list_book_category = new ListBox();

		// for loop for each item to be added
		update_list_book_category.addItem("Sci Fi");
		update_list_book_category.addItem("Spiritual");
		update_list_book_category.setVisibleItemCount(3);
		RootPanel.get("update_list_book_category").add(update_list_book_category);

		// adding btn_book_reset
		Button update_btn_book_reset = new Button("Reset");
		RootPanel.get("update_btn_book_reset").add(update_btn_book_reset);

		// adding btn_book_reset
		Button update_btn_book_submit = new Button();
		RootPanel.get("update_btn_book_submit").add(update_btn_book_submit);

	}
}
