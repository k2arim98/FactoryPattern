/**
 */
package Bowling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Bowling.Tournament#getMatchup <em>Matchup</em>}</li>
 *   <li>{@link Bowling.Tournament#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see Bowling.BowlingPackage#getTournament()
 * @model
 * @generated
 */
public interface Tournament extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchup</em>' reference.
	 * @see #setMatchup(Matchup)
	 * @see Bowling.BowlingPackage#getTournament_Matchup()
	 * @model
	 * @generated
	 */
	Matchup getMatchup();

	/**
	 * Sets the value of the '{@link Bowling.Tournament#getMatchup <em>Matchup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matchup</em>' reference.
	 * @see #getMatchup()
	 * @generated
	 */
	void setMatchup(Matchup value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Bowling.TournamentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Bowling.TournamentType
	 * @see #setType(TournamentType)
	 * @see Bowling.BowlingPackage#getTournament_Type()
	 * @model
	 * @generated
	 */
	TournamentType getType();

	/**
	 * Sets the value of the '{@link Bowling.Tournament#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Bowling.TournamentType
	 * @see #getType()
	 * @generated
	 */
	void setType(TournamentType value);

} // Tournament
