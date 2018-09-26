/**
 */
package library.impl;

import java.util.Collection;

import library.Author;
import library.Book;
import library.Library;
import library.LibraryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link library.impl.LibraryImpl#getListAuthor <em>List Author</em>}</li>
 *   <li>{@link library.impl.LibraryImpl#getListBook <em>List Book</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends MinimalEObjectImpl.Container implements Library {
	/**
	 * The cached value of the '{@link #getListAuthor() <em>List Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Author> listAuthor;

	/**
	 * The cached value of the '{@link #getListBook() <em>List Book</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListBook()
	 * @generated
	 * @ordered
	 */
	protected Book listBook;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Author> getListAuthor() {
		if (listAuthor == null) {
			listAuthor = new EObjectContainmentEList<Author>(Author.class, this, LibraryPackage.LIBRARY__LIST_AUTHOR);
		}
		return listAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Book getListBook() {
		return listBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListBook(Book newListBook, NotificationChain msgs) {
		Book oldListBook = listBook;
		listBook = newListBook;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__LIST_BOOK, oldListBook, newListBook);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListBook(Book newListBook) {
		if (newListBook != listBook) {
			NotificationChain msgs = null;
			if (listBook != null)
				msgs = ((InternalEObject)listBook).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.LIBRARY__LIST_BOOK, null, msgs);
			if (newListBook != null)
				msgs = ((InternalEObject)newListBook).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.LIBRARY__LIST_BOOK, null, msgs);
			msgs = basicSetListBook(newListBook, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__LIST_BOOK, newListBook, newListBook));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__LIST_AUTHOR:
				return ((InternalEList<?>)getListAuthor()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY__LIST_BOOK:
				return basicSetListBook(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__LIST_AUTHOR:
				return getListAuthor();
			case LibraryPackage.LIBRARY__LIST_BOOK:
				return getListBook();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__LIST_AUTHOR:
				getListAuthor().clear();
				getListAuthor().addAll((Collection<? extends Author>)newValue);
				return;
			case LibraryPackage.LIBRARY__LIST_BOOK:
				setListBook((Book)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__LIST_AUTHOR:
				getListAuthor().clear();
				return;
			case LibraryPackage.LIBRARY__LIST_BOOK:
				setListBook((Book)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__LIST_AUTHOR:
				return listAuthor != null && !listAuthor.isEmpty();
			case LibraryPackage.LIBRARY__LIST_BOOK:
				return listBook != null;
		}
		return super.eIsSet(featureID);
	}

} //LibraryImpl
