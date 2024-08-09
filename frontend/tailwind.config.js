/** @type {import('tailwindcss').Config} */
export const content = [
    "./css/**/*.{html,js}",
    "./index.html"
]
export const theme = {
    extend: {
        fontFamily: {
            sans: ["Inter", "sans-serif"],
        },
    },
}
export const plugins = []