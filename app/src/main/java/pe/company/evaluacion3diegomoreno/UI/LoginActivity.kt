package pe.company.evaluacion3diegomoreno.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import androidx.core.widget.addTextChangedListener
import pe.company.evaluacion3diegomoreno.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var bindind: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindind = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(bindind.root)

        bindind.tilemail.editText?. addTextChangedListener { text ->
            bindind.btnlogin.isEnabled = validedEmailPass(text.toString(), bindind.tilpass.editText?.text.toString())
        }

        bindind.tilpass.editText?. addTextChangedListener { text ->
            bindind.btnlogin.isEnabled = validedEmailPass(bindind.tilemail.editText?.text.toString(), text.toString())
        }

        bindind.btnlogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun validedEmailPass(email: String, pass: String): Boolean {
        val ValidateEmail = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
        val ValidatePass = pass.length >= 6
        return ValidateEmail && ValidatePass
    }
}