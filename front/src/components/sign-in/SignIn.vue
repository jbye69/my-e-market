<template>
        <div class="container-contact">
            <div class="wrap-contact">
                <form class="contact-form validate-form">
                    <span class="contact-form-title">
						Sign in
					</span>
                    <div class="wrap-input validate-input" >
                        <input class="input" type="name" name="name">
                        <span class="focus-input" data-placeholder="NAME"></span>
                    </div>
                    <div class="wrap-input validate-input" >
                        <input class="input" type="text" name="email">
                        <span class="focus-input" data-placeholder="EMAIL"></span>
                    </div>
                    <div class="wrap-input validate-input">
                        <input type="password" class="input" name="password">
                        <span class="focus-input" data-placeholder="PASSWORD"></span>
                    </div>
                    <div class="wrap-input validate-input">
                        <input type="password" class="input" name="passwordConfirmation">
                        <span class="focus-input" data-placeholder="PASSWORD CONFIRMATION"></span>
                    </div>
                    <div class="container-contact-form-btn">
                        <div class="wrap-contact-form-btn">
                            <div class="contact-form-bgbtn"></div>
                            <button class="contact-form-btn">SAVE</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
</template>
<script>
</script>
<style scoped src="@/components/sign-in/css/main.css">
</style>