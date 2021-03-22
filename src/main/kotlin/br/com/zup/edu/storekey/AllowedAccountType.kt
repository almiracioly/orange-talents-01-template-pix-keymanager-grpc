package br.com.zup.edu.storekey

enum class AllowedAccountType {
    SAVING {
        override fun translated(): String {
            return "CONTA_POUPANCA"
        }
    },
    CHECKING {
        override fun translated(): String {
            return "CONTA_CORRENTE"
        }
    };

    abstract fun translated(): String

}
