package br.com.zup.edu.storekey

enum class AllowedKeyType {

    CPF {
        override fun isValid(value: String): Boolean {
            return value.matches("^[0-9]{11}\$".toRegex())
        }
    },
    PHONE {
        override fun isValid(value: String): Boolean {
            return value.matches("^\\+[1-9][0-9]\\d{1,14}\$".toRegex())
        }
    },
    EMAIL {
        override fun isValid(value: String): Boolean {
            // TODO: Implementar validacao de Email.
            throw NotImplementedError("This validation has not yet been implemented")
        }
    },
    RANDOM {
        override fun isValid(value: String): Boolean {
            return true
        }
    };

    abstract fun isValid(value: String): Boolean
}